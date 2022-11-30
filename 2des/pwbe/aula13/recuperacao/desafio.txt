# Ava. Recuperação. Backend

- Criar endpoint para o login : 
	Endpoint : http://localhost:3000/login
	Metodo : POST
	Body : {
		email : "",
		senha : ""
	}

- Criar endpoint para listar produtos : 
	Endpoint : http://localhost:3000/produtos
	Metodo : GET

- Criar endpoint para exibir um produto específico : 
	Endpoint : http://localhost:3000/produto/:id_produto
	Metodo : GET

- Criar endpoint para listar os produtos no carrinho do cliente : 
	Endpoint : http://localhost:3000/carrinho/:id_usuario
	Metodo : GET
	Retorno : [
		{
			id_produto: 0,
			nome: '',
			quantidade: 0
		},
		{
			id_produto: 0,
			nome: '',
			quantidade: 0
		}
	]

- Criar endpoint para inserir um produto no carrinho :
	Endpoint : http://localhost:3000/carrinho
	Metodo : POST
	Body : {
		id_produto: 0,
		id_usuario: 0,
		quantidade: 0
	}

- Criar endpoint para remover produto do carrinho : 
	Endpoint : http://localhost:3000/carrinho/:id_usuario
	Metodo : DELETE
	Body : {
		id_produto
	}

- Criar endpoint para alterar informações do usuário : 
	Endpoint : http://localhost:3000/usuario/:id_usuario
	Metodo : PUT
	Body : {
		nome : "",
		email : "",
		senha : ""
	}

