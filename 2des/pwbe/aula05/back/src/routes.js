const Express = require('express');

const router = Express.Router();

const ProdutosController = require("./controllers/ProdutosController");
const FuncionariosController = require("./controllers/FuncionariosController");

router.get("/produtos", ProdutosController.listarProdutos);
router.get("/produto/:cod", ProdutosController.listaProduto);
router.post("/produtos", ProdutosController.cadastrarProduto);
router.delete("/produto", ProdutosController.excluirProduto);
router.put("/produto", ProdutosController.editarProduto);

router.get("/funcionarios", FuncionariosController.listarFuncionarios);
router.get("/funcionario/:matricula", FuncionariosController.listaFuncionario);
router.post("/funcionarios", FuncionariosController.cadastrarFuncionario);
router.delete("/funcionario", FuncionariosController.excluirFuncionario);
router.put("/funcionario", FuncionariosController.editarFuncionario);

module.exports = router;