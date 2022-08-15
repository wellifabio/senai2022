var usuarios = [
    {
        "nome":"Fulano da Silva",
        "img":"http........",
        "login":"fulano",
        "senha":"12345"
    },
    {
        "nome":"Ciclano da Rua",
        "img":"http........",
        "login":"ciclano",
        "senha":"12345"
    },
    {
        "nome":"Beltrano Achado",
        "img":"http........",
        "login":"beltrano",
        "senha":"12345"
    }
];

function salvar() {
    let infoUser = [
        {
            "id":1,
            "produto":"teste"
        },
        {
            "id":2,
            "produto":"teste 2"
        }
    ];

    let infoTexto = JSON.stringify(infoUser);

    window.localStorage.setItem("userData", infoTexto);
}

function carregar() {
    let info = window.localStorage.getItem("userData");
    let objUser = JSON.parse(info);
    console.log(objUser);
    console.log(info);
}

function apagar() {
    //window.localStorage.removeItem("userData");
    //window.localStorage.clear();
    
    let info = window.localStorage.getItem("userData");
    let objUser = JSON.parse(info);

    objUser.pop();

    window.localStorage.setItem("userData", JSON.stringify(objUser));
}

function login(){
    let usuario = "fulano";
    let senha = "12345";

    usuarios.forEach(user => {
        if(user.login == usuario && user.senha == senha) {
            console.log(user);
            window.localStorage.setItem("dados_do_usuario", JSON.stringify(user));
        }
    })
}