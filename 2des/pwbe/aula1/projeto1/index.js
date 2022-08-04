const express = require('express');
const app = express();

app.use(express.json());

app.get('/projeto1',(req, res)=>{
    res.json("Oi outra coisa");
});

app.listen(3000,()=>{
    console.log("Respondendo na porta 3000");
});