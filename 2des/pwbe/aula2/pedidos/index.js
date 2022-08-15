//Importa as pricipais dependências
const express = require('express'); //Habilita os verbos HTTP
const mysql = require('mysql'); //Habilita a conexão com o Banco de dados
const bodyParser = require('body-parser'); //Habilita conversão de Form POST para JSON
const cors = require('cors');
//Inicia a aplicação para responder as requisições
const app = express();

//Cria a conexão com o Banco de dados
const con = mysql.createConnection({
    user: 'root',
    host: 'localhost',
    database: 'pedidos'
});

app.use(cors());
//Configurações básicas da aplicação
app.use(express.json());
//Converte o corpo de um formulário recebido via post para json
app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());

//Responde ao que chega pelo verbo POST e envia para o Banco de dados
app.post('/clientes', (req, res) => {
    let priNome = req.body.priNome;
    let sobrenome = req.body.sobrenome;
    let endereco = req.body.endereco;
    let telefones = req.body.telefones.split("\r\n");
    let string = `insert into clientes value(null,'${priNome}','${sobrenome}','${endereco}')`;
    let resposta = {
        dados:"Dados recebidos com sucesso"
    };
    //Preparar o envio ao Banco de Dados
    con.query(string, (err, result) => {
        if (err == null) {
            resposta.cliente = "Dados do cliente enviados com sucesso ao BD";
            //Laço para enviar os telefones
            telefones.forEach((e)=>{
                string = `insert into telefones values(${result.insertId},'${e}')`;
                con.query(string,(err, result)=>{
                    if(err == null){
                        resposta.telefones = "Tefefones enviados com sucesso ao BD";
                    }else{
                        resposta.erroTel = "Erro ao enviar telefones ao BD";
                    }
                });
            });
        } else {
            resposta.erroDB = "Erro ao enviar dados ao Banco de dados";
        }
        res.json(resposta);
    });
});

//Responde as requisições que chegam pelo verbo GET
app.get('/clientes', (req, res) => {
    let string = `Select * from clientes`;
    con.query(string,(err, result)=>{
        if(err == null){
            res.json(result);
        }
    });
});


//Inicia o túnel e ouve os verbos HTTP
app.listen(3000, () => {
    console.log("Respondendo na porta 3000");
});