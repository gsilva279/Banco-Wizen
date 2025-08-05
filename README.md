# Banco Digital - Projeto Java

[![Java](https://img.shields.io/badge/Java-17+-blue.svg)](https://www.oracle.com/java/)
[![GitHub](https://img.shields.io/badge/License-MIT-green.svg)](https://opensource.org/licenses/MIT)

Projeto de simulação bancária desenvolvido em Java que permite gerenciar uma conta bancária básica com operações como saques, depósitos, pagamentos e uso de cheque especial.

## 🚀 Funcionalidades

- ✅ Consulta de saldo
- 💳 Uso de cheque especial
- 📥 Depósitos
- 📤 Saques
- 🏦 Pagamento de boletos
- 🔍 Verificação do cheque especial
- 💰 Cobrança automática de taxa sobre uso do cheque especial

## 📋 Pré-requisitos

- JDK 17 ou superior
- Git (opcional para clonar o repositório)

## 🔧 Instalação

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/banco-digital.git
```

2. Navegue até o diretório do projeto:
```bash
cd banco-digital
```

3. Compile o arquivo Java.
```bash
javac Banco.java
```

4. Execute o programa:
```bash
java Banco
```

## 📝 Estrutura do Projeto
```
banco-digital/
│
├── Banco.java         # Código fonte principal
├── .gitignore         # Arquivo para ignorar arquivos desnecessários
└── README.md          # Este arquivo
```

## 💡 Como Usar

Ao executar o programa, você poderá:

- Consultar seu saldo atual
- Realizar depósitos
- Fazer saques (incluindo uso de cheque especial)
- Pagar boletos
- Verificar se está usando cheque especial

O sistema calcula automaticamente:

- Limite do cheque especial (500 ou 50% do saldo para valores maiores)
- Taxa de 20% sobre o valor utilizado do cheque especial

## 📄 Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo LICENSE para detalhes.

## ✉️ Contato

[José Gilvanilson] - josegilvanilson2020@gmail.com

Link do Projeto: https://github.com/seu-usuario/banco-digital