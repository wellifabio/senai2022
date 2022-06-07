require('dotenv').config();

const Express = require('Express');
const cors = require('cors');
const app = Express();

const routes = require('./routes.js');

app.use(Express.json());
app.use(cors());
app.use(routes);

app.listen(process.env.APP_PORT, () => {
    console.log("Rodando");
});