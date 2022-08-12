//Importa as pricipais dependências
const express = require('express'); //Habilita os verbos HTTP
const mysql = require('mysql'); //Habilita a conexão com o Banco de dados
const bodyParser = require('body-parser'); //Habilita conversão de Form POST para JSON

//Inicia a aplicação para responder as requisições
const app = express();

//Cria a conexão com o Banco de dados
const con = mysql.createConnection({
    user: 'root',
    host: 'localhost',
    database: 'pedidos'
});

//Configurações básicas da aplicação
app.use(express.json());
//Converte o corpo de um formulário recebido via post para json
app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());

//Ouve o que chega pelo verbo POST
app.post('/pedidos', (req, res) => {
    let priNome = req.body.priNome;
    let sobrenome = req.body.sobrenome;
    let endereco = req.body.endereco;
    let string = `insert into clientes value(null,'${priNome}','${sobrenome}','${endereco}')`;
    console.log(req.body);
    con.query(string, (err, result) => {
        if (err == null) {
            res.json("Dados recebidos com sucesso e enviados para o nosso Banco de Dados");
        } else {
            res.json("Dados recebidos com sucesso, porém não conseguimos enviar para o banco de dados");
        }
    });
});

//Inicia o túnel e ouve os verbos HTTP
app.listen(3000, () => {
    console.log("Respondendo na porta 3000");
});