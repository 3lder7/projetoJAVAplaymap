# ⚽ PlayMap - Agendamento de Quadras de Futebol (Java)
O PlayMap é uma aplicação em Java que permite aos usuários agendar horários em quadras e campos de futebol. O sistema foi projetado para ser intuitivo e fácil de usar, oferecendo uma interface gráfica amigável desenvolvida com Java Swing. A aplicação é estruturada em camadas, seguindo boas práticas de design de software, o que garante uma separação clara de responsabilidades entre as diferentes partes do código.

## 🎯 Principais Funcionalidades
- ✔️ **Registrar-se:** Os usuários podem criar uma conta fornecendo informações básicas, como nome, e-mail e senha.
- ✔️ **Visualizar Quadras:** A aplicação exibe uma lista de quadras e campos de futebol disponíveis, mostrando detalhes como nome e endereço.
- ✔️ **Agendar Horários:** Os usuários podem selecionar uma quadra e um horário disponível para agendar uma partida. O sistema verifica a disponibilidade do horário e confirma o agendamento.
- ✔️ **Remover Agendamentos:** Os usuários têm a opção de cancelar agendamentos previamente realizados, liberando o horário para outros usuários.

## 🎲 Estrutura de Dados
- **ArrayList:** Utilizado para armazenar os horários disponíveis e os agendamentos realizados. Cada quadra possui uma lista de horários que são atualizados conforme os agendamentos são feitos ou removidos.
- **ClassesDTO:**  As classes Cliente e CampoFutebol atuam como Data Transfer Objects, representando os dados que são manipulados na aplicação.

## 📂 Estrutura do Projeto
```
/projetoJAVAplaymap-main
│
├── 📂src                         # Código fonte do projeto
│   ├── 📂Aplicativo              # Pacote principal do aplicativo
│   │   ├── 📄Agendamento.java    # Classe responsável pelo agendamento de horários
│   │   ├── 📄App.java            # Classe principal que inicia o aplicativo
│   │   ├── 📄CampoFutebol.java   # Classe que gerencia a exibição de campos de futebol
│   │   └── 📄Cliente.java        # Classe que gerencia o registro e login de usuários
│   │
│   ├── 📂resources               # Recursos do projeto
│   │   ├── 📂images              # Imagens utilizadas no aplicativo
│  
```
### Modelo
- **Cliente.java:** Classe que representa um usuário do sistema, contendo atributos como nome, e-mail e senha.
- **CampoFutebol.java:** Classe que representa um campo de futebol, contendo informações como nome e endereço.

### Controle
- **Agendamento.java:** Classe responsável pela lógica de agendamento, incluindo a verificação de horários disponíveis e a manipulação de agendamentos.

### Visualização
- **App.java:** Classe principal que inicia a aplicação e gerencia a interface gráfica.
- **Interface Gráfica:** Utiliza Java Swing para criar janelas e interações com o usuário.
  
## 💾 Tecnologias Utilizadas
- ✅**Java:** Linguagem de programação principal.
- ✅**Java Swing:** Biblioteca para criação da interface gráfica.
- ✅**ArrayList:** Estruturas de dados utilizadas para armazenar horários disponíveis e agendados.

## 🛠️ Configuração do Ambiente 
1. Certifique-se de ter o **Java JDK 8** ou superior instalado.
2. Clone o repositório:
```
git clone https://github.com/3lder7/projetoJAVAplaymap.git
```
3. Abra o projeto em sua IDE preferida (como Eclipse ou IntelliJ IDEA).
4. Compile e execute a classe App.java para iniciar a aplicação.

## 🤝 Contribuições
Sinta-se à vontade para contribuir! Basta fazer um fork do repositório, criar uma nova branch com sua funcionalidade ou correção e abrir um pull request. 🚀

 ---
Feito por **Elder Galvão** 🐈‍⬛
