const mongoose = require('mongoose');
const Schema = mongoose.Schema;
let PatrimonioSchema = new Schema({
    ni: {type: Number, required: true},
    aquisicao: {type: Date, required: true},
    denominacao: {type: String, required: true, max: 100},
    valor: {type: Number, required: true},
    img: {type: String, required: true, max: 100}
});
// Exportar o modelo
module.exports = mongoose.model('Patrimonio', PatrimonioSchema);