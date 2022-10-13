# O que é um campo blob?
- O blob (Binary Large Object - grande objeto binário) é um campo criado para o armazenamento de qualquer tipo de informações em formato binário, dentro de uma tabela de um banco de dados.
- O MySQL trabalha com campos blob, que são na verdade campos texto (TEXT) com uma única diferença: campos texto são"case-insensitive", ao contrário dos blob"s.
- Os blob"s são divididos em quatro tipos (no MySQL), sendo que a diferença existente de um para o outro é unicamente a capacidade de armazenamento e trabalho do campo. Estes são:
    - <b>TINYBLOB</b> - campo blob de armazenamento máximo igual a 255 caracteres (8 bits) mais 1 de controle;
    - <b>BLOB</b> - o mesmo que o Tinyblob, porém armazenando até 16535 caracteres (16 bits) mais 2 de controle;
    - <b>MEDIUMBLOB</b> - o mesmo que o tinyblob, porém armazenando até 16777216 caracteres (24 bits) mais 3 de controle;
    - <b>LONGBLOB</b> - o mesmo que o tinyblob, porém armazenando até 4294967295 caracteres (32 bits) mais 4 de controle.

- Além disto, existem as seguintes particularidades com os campos blobs:
- Não podem ser chaves primárias (excluindo Tinyblob);
- Não é possível usar os comandos GROUP e SORT com campos blob;
- São reconhecidos como um LONGVARCHAR para drivers ODBC.