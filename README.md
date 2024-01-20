<h1> Lib Manager PRO <h1>

<h1>Documentação do Projeto - Sistema de Biblioteca em Java</h1>

<h2>Introdução</h2>
<p>Este projeto implementa um sistema simples de biblioteca em Java, onde os usuários podem adicionar livros, visualizar a lista de livros disponíveis, e realizar operações de aluguel. O sistema é executado no console e utiliza conceitos de orientação a objetos para representar livros, categorias e status de disponibilidade.</p>

<h2>Arquitetura</h2>
<p>O projeto é dividido e+-m três pacotes principais: <code>application</code>, <code>entities</code> e <code>entities.enums</code>.</p>
<ol>
<li><strong><code>application</code>:</strong> Contém a classe <code>Program</code>, que é a classe principal responsável pela interação com o usuário e pela execução do programa.</li>
       <li><strong><code>entities</code>:</strong> Contém as classes relacionadas à representação dos dados. A classe <code>Book</code> modela um livro, <code>Category</code> representa a categoria de um livro, e <code>BookStatus</code> é uma enumeração para o status de disponibilidade do livro.</li>
        <li><strong><code>entities.enums</code>:</strong> Contém a enumeração <code>BookStatus</code> para representar os estados possíveis de um livro (disponível ou indisponível).</li>
    </ol>

   <h2>Decisões de Design</h2>
   <ul>
        <li><strong>Classe Book:</strong> A classe <code>Book</code> possui atributos como nome, autor, ID, categoria e status, sendo representada por métodos getters e setters para acesso aos seus atributos. A sobrescrita do método <code>toString</code> permite uma representação amigável dos objetos <code>Book</code>.</li>
        <li><strong>Classe Category:</strong> A classe <code>Category</code> representa a categoria de um livro. É uma classe simples com um construtor, um método getter e um método setter para a categoria.</li>
        <li><strong>Classe BookStatus:</strong> A enumeração <code>BookStatus</code> é usada para representar o estado de disponibilidade de um livro, com os valores <code>AVAILABLE</code> e <code>UNAVAILABLE</code>.</li>
        <li><strong>Entrada de Dados:</strong> Utiliza-se a classe <code>Scanner</code> para a entrada de dados do usuário, permitindo a interação na linha de comando.</li>
        <li><strong>Listagem de Livros:</strong> Após a entrada dos dados, a lista de livros é exibida no console, destacando o status de disponibilidade.</li>
        <li><strong>Operação de Aluguel:</strong> O usuário pode escolher um livro para alugar, e o programa modifica o status do livro para <code>UNAVAILABLE</code>, refletindo a operação de aluguel.</li>
    </ul>

   <h2>Resolução de Problemas Específicos e Valor Agregado</h2>
    <ul>
        <li><strong>Representação de Livros e Categorias:</strong> A utilização de classes separadas para representar livros e categorias permite uma estrutura modular e fácil extensão. Novas funcionalidades relacionadas a categorias podem ser adicionadas sem afetar diretamente a classe <code>Book</code>.</li>
        <li><strong>Enumeração de Status de Livro:</strong> O uso da enumeração <code>BookStatus</code> proporciona uma forma clara e legível de representar o status de disponibilidade de um livro, facilitando a compreensão do código.</li>
        <li><strong>Interatividade do Usuário:</strong> O programa interage de maneira amigável com o usuário, fornecendo instruções claras e solicitando as informações necessárias para a operação desejada.</li>
        <li><strong>Saída Formatada:</strong> A lista de livros e o status da biblioteca são apresentados de forma formatada e fácil de ler, proporcionando uma experiência mais agradável ao usuário.</li>
    </ul>

   <h2>Conclusão</h2>
    <p>O projeto fornece uma base sólida para um sistema de biblioteca em Java, demonstrando boas práticas de programação, modularidade e interatividade com o usuário. A estrutura orientada a objetos facilita a manutenção e expansão do sistema, enquanto a interface simples permite uma experiência de usuário intuitiva.</p>

</body>
</html>
