//Criar um componente para o item da lista da tela compromissos.
//Criar um componente para o botão da tela descricao.

//Cores Utilizadas
#3A3A3A
#53693C
#FFFFFF

//Os dados utilizados não podem ser alterados ou reordenados.

//Base Tela Compromissos
const data = [
    {
        "id":1,
        "tipo":2,
        "nome":"Escola",
        "horario":"07:30 - 11:30"
    },
    {
        "id":2,
        "tipo":1,
        "nome":"Consulta Médica",
        "horario":"13:00 - 13:40"
    },
    {
        "id":3,
        "tipo":3,
        "nome":"Ir ao mercado",
        "horario":"16:30 - 17:00"
    },
    {
        "id":4,
        "tipo":4,
        "nome":"Ir ao cinema",
        "horario":"20:00 - 22:30"
    },
]

//Base Tela Descricao
const data = [
    {
        "id_compromisso": 1,
        "descricao":"- Entrega da Atividade.\n- Matéria Nova.",
        "observacoes":"",
    },
    {
        "id_compromisso": 4,
        "descricao":"",
        "observacoes":"Não esquecer a carteirinha !!!",
    },
    {
        "id_compromisso": 3,
        "descricao":"- Pão.\n- Presunto.\n- Queijo.",
        "observacoes":"Ver se o sabão está em promoção e levar uma caixa.",
    },
    {
        "id_compromisso": 2,
        "descricao":"Consulta de retorno.",
        "observacoes":"Levar os exames.",
    },
]
