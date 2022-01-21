const { Model, DataTypes } = require('sequelize');

class Localizacao extends Model {
    static init(datacon) {
        super.init(
            {
                coordenadas: {
                    type: DataTypes.STRING(25),
                    allowNull: false,
                },
                id_user: {
                    type: DataTypes.INTEGER,
                    allowNull: false,
                    references: {
                        model: 'usuario',
                        key: 'id',
                    }
                },
                id_alerta: {
                    type: DataTypes.INTEGER,
                    allowNull: false,
                    references: {
                        model: 'alerta',
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
}