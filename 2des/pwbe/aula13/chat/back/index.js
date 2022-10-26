require('dotenv').config();
const PORT = process.env.PORT || 3000
const { createServer } = require("http");
const { Server } = require("socket.io");

const httpServer = createServer();
const io = new Server(httpServer, {
    cors: {
        "origem": "*"
    },
});

io.on("connection", (socket) => {
    socket.join("sala");
    socket.on("sala01", (data) => {
        console.log(data);
        socket.to("sala").emit("resp", { msg: data });
    });
});

httpServer.listen(3000, () => {
    console.log("Server running on port" + PORT);
});