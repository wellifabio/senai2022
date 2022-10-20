const { createServer } = require("http");
const { Server } = require("socket.io");

const httpServer = createServer();
const io = new Server(httpServer, { 
    cors: {
        "origem":"*"
    },
});

var content = "";

io.on("connection", (socket) => {
    socket.join("sala");

    socket.on("teste", (data) => {
        content += data.message + "\n";
        socket.to("sala").emit("resp", {message:content});
    });
});

httpServer.listen(3000, () => { console.log("Server running"); });
