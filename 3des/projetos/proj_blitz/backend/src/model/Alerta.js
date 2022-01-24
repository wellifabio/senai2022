const { Model, DataTypes } = require('sequelize');

class Alerta extends Model {
    static init(datacon) {
        super.init(
            {
                tipo: {
                    type: DataTypes.STRING(50),
                    allowNull: false,
                },
                duracao: {
                    type: DataTypes.INTEGER,
                    allowNull: false,
                },
                descricao: {
                    type: DataTypes.STRING(150),
                    allowNull: true,
                },
            },
            {
                sequelize: datacon,
                tableName: 'alertas',
                modelName: 'alerta',
            }
        );
    }

    static associate(models) {
        Alerta.hasMany(models.localizacao, { foreignKey: 'id_alerta'});
    }
}

module.exports = Alerta;