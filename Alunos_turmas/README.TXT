2) Sistema de Cadastro de Alunos em Turmas
Crie uma classe chamada Aluno com os seguintes atributos:

matricula (String)

nome (String)

email (String)

Implemente os métodos básicos para essa classe (construtor, getters, setters e toString).

Em seguida, desenvolva uma classe chamada Turma, que deve conter:

Nome da disciplina (String)

Número da turma (int)

Vetor de alunos com tamanho definido pelo usuário

A classe Turma deve implementar:

Um construtor para inicializar a disciplina, o número da turma e o tamanho do vetor de alunos

Um método adicionarAluno(Aluno a) que insere um aluno na turma, verificando se já existe um aluno com a mesma matrícula (evitar duplicidade)

Um método toString() que retorna uma representação textual da turma e seus alunos

Por fim, crie uma classe Principal que:

Recebe o nome da disciplina, o número da turma e o tamanho da turma como entrada

Cria a turma

Cadastra manualmente dois alunos, adicionando-os à turma

Testa se os alunos foram corretamente inseridos no vetor, exibindo os dados da turma