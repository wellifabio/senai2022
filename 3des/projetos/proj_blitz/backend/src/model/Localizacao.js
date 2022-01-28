const { Model, DataTypes } = require('sequelize');

class Localizacao extends Model {
    static init(datacon) {
        super.init(
            {
                coordenadas: {
                    type: DataTypes.STRING(70),
                    allowNull: false,
                },
                id_user: {
                    type: DataTypes.INTEGER,
                    allowNull: false,
                    references: {
                        model: 'usuarios',
                        key: 'id',
                    }
                },
                id_alerta: {
                    type: DataTypes.INTEGER,
                    allowNull: false,
                    references: {
                        model: 'alertas',
                        key: 'id',
                    }
                },
                ativo: {
                    type: DataTypes.BOOLEAN,
                    allowNull: false,
                }
            },
            {
                sequelize: datacon,
                tableName: 'localizacoes',
                modelName: 'localizacao',
            }
        );
    }

    static associate(models) {
        Localizacao.belongsTo(models.usuario, { foreignKey: 'id_user' });
        Localizacao.belongsTo(models.alerta, { foreignKey: 'id_alerta' });
    }
}

module.exports = Localizacao;