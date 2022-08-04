const express = require('express');
const app = express();

app.use(express.json());

app.get('/backnode',(req, res)=>{
    res.json("Alô mundo");
});

app.listen(3000,()=>{
    console.log("Respondendo na porta 3000");
});