#Respostas

1 - Em programação orientada a objetos, uma classe é uma estrutura que define o comportamento e as propriedades de objetos. Uma classe é como um modelo ou um plano para criar objetos. Ela define atributos (variáveis) e métodos (funções) que os objetos criados a partir dela terão. Por exemplo, uma classe "Carro" pode ter atributos como modelo, cor e ano, e métodos como ligar, desligar, acelerar, etc.

Um objeto, por outro lado, é uma instância de uma classe. É uma entidade real criada com base no modelo fornecido pela classe. Usando o exemplo anterior, um objeto seria um carro específico com um modelo, cor e ano específicos.

Exemplos:
// classe Pessoa feito em c++

#include <iostream>
#include <string>
using namespace std;

class Pessoa {
public:
    string nome;
    int idade;
}

int main() {
    Pessoa pessoa1;
    pessoa1.nome = "João";
    pessoa1.idade = 25;
    
    // Uso dos objetos
    cout << pessoa2.nome << " tem " << pessoa2.idade << " anos." << endl;

    return 0;
}
---------------------------------------------------------------------------------------
// classe Pessoa feito em java

public class Pessoa {
    String nome;
    int idade;
}

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";
        pessoa1.idade = 25;
        
        // Uso dos objetos
        System.out.println(pessoa1.nome + " tem " + pessoa1.idade + " anos.");
    }
}
---------------------------------------------------------------------------------------
//classe Retangulo feito em c++

#include <iostream>
using namespace std;

class Retangulo {
public:
    float comprimento;
    float largura;
};

int main() {
    Retangulo retangulo1;
    retangulo1.comprimento = 5.0;
    retangulo1.largura = 3.0;

    // Uso dos objetos
    cout << "Área do retângulo 1: " << retangulo1.comprimento * retangulo1.largura << endl;

    return 0;
}
---------------------------------------------------------------------------------------------------
//classe Retangulo feito em java

public class Retangulo {
    float comprimento;
    float largura;
}

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo();
        retangulo1.comprimento = 5.0f;
        retangulo1.largura = 3.0f;

        // Uso dos objetos
        System.out.println("Área do retângulo 1: " + retangulo1.comprimento * retangulo1.largura);
    }
}
--------------------------------------------------------------------------------------------------------------
// classe Carro feito em java

public class Carro {
    // Atributos
    String marca;
    String modelo;
    int ano;
    boolean ligado;

    // Método para ligar o carro
    public void ligar() {
        if (!ligado) {
            System.out.println("Carro ligado.");
            ligado = true;
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    // Método para desligar o carro
    public void desligar() {
        if (ligado) {
            System.out.println("Carro desligado.");
            ligado = false;
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    // Método para exibir informações do carro
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
    }

    // Método main para testar a classe
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.ano = 2022;

        meuCarro.exibirInformacoes();
        meuCarro.ligar();
        meuCarro.exibirInformacoes();
        meuCarro.desligar();
        meuCarro.exibirInformacoes();
    }
}
-----------------------------------------------------------------------------------------------------------
2 - Em Java, você declara uma variável especificando o tipo de dado seguido pelo nome da variável.
exemplo:

// Declarando uma variável inteira em Java
int minhaVariavelInteira;

// Atribuindo um valor à variável
minhaVariavelInteira = 10;

------------------------------------------------------------------
Os tipos de dados primitivos mais comuns em Java são:

1 - int: para armazenar números inteiros.
2 - double: para armazenar números de ponto flutuante (com decimais).
3 - float: também para armazenar números de ponto flutuante, mas com menos precisão do que o double.
4 - char: para armazenar caracteres individuais.
5 - boolean: para armazenar valores lógicos (verdadeiro ou falso).
6 - byte, short, long: para armazenar números inteiros de diferentes tamanhos.

Declaração de variável em c++, exemplo:

// Declarando uma variável inteira em C++
int minhaVariavelInteira;

// Atribuindo um valor à variável
minhaVariavelInteira = 10;

-----------------------------------------------------------------------------------------

Em C++, os tipos de dados primitivos mais comuns são semelhantes aos de Java, mas com algumas diferenças na nomenclatura:

1 - int: para armazenar números inteiros.
2 - double: para armazenar números de ponto flutuante.
3 - float: também para armazenar números de ponto flutuante, com menos precisão que o double.
4 - char: para armazenar caracteres individuais.
5 - bool: para armazenar valores lógicos (true ou false).
6 - short, long, long long: para armazenar números inteiros de diferentes tamanhos.

--------------------------------------------------------------------------------------------------------------

3 - Em programação orientada a objetos, a herança é um conceito fundamental que permite que uma classe herde características (campos e métodos) de outra classe. Em Java, a herança é suportada por meio da palavra-chave extends. 

exemplo em java:

// Classe base (superclasse)
class Animal {
    void fazerSom() {
        System.out.println("Barulho genérico de animal");
    }
}

// Classe derivada (subclasse)
class Cachorro extends Animal {
    void latir() {
        System.out.println("Au au!");
    }
}

public class TesteHeranca {
    public static void main(String[] args) {
        // Criando uma instância da subclasse
        Cachorro meuCachorro = new Cachorro();

        // Chamando método da superclasse
        meuCachorro.fazerSom();

        // Chamando método da subclasse
        meuCachorro.latir();
    }
}
------------------------------------------------------------------------------------------------
Exemplo em c++ 

#include <iostream>

// Exemplo 1: Herança Simples
class Animal {
public:
    void fazerSom() {
        std::cout << "Barulho genérico de animal\n";
    }
};

class Cachorro : public Animal {
public:
    void latir() {
        std::cout << "Au au!\n";
    }
};

// Exemplo 2: Herança Múltipla
class Veiculo {
public:
    void ligar() {
        std::cout << "Veículo ligado\n";
    }
};

class Carro : public Veiculo, public Animal {
public:
    void acelerar() {
        std::cout << "Carro acelerando\n";
    }
};

// Exemplo 3: Sobrescrita de Método
class Gato : public Animal {
public:
    void fazerSom() override {
        std::cout << "Miau!\n";
    }
};

// Exemplo 4: Construtores e Destrutores
class Pessoa {
public:
    Pessoa() {
        std::cout << "Construtor Pessoa\n";
    }

    ~Pessoa() {
        std::cout << "Destrutor Pessoa\n";
    }
};

class Estudante : public Pessoa {
public:
    Estudante() {
        std::cout << "Construtor Estudante\n";
    }

    ~Estudante() {
        std::cout << "Destrutor Estudante\n";
    }
};

// Exemplo 5: Proteção de Membros
class Base {
protected:
    int protegido;
};

class Derivada : public Base {
public:
    void modificarProtegido() {
        protegido = 42;
    }
};

int main() {
    // Testando os exemplos
    Cachorro meuCachorro;
    meuCachorro.fazerSom();
    meuCachorro.latir();

    Carro meuCarro;
    meuCarro.ligar();
    meuCarro.acelerar();

    Gato meuGato;
    meuGato.fazerSom();

    Estudante estudante;

    Derivada objetoDerivado;
    objetoDerivado.modificarProtegido();

    return 0;
}
--------------------------------------------------------------------------------

4 - Em Java, a declaração de uma variável cria uma referência para um objeto na memória, mas a linguagem gerencia automaticamente a alocação e liberação de memória. Em outras palavras, quando você declara uma variável em Java, você está criando uma referência a um objeto, mas não precisa se preocupar com a alocação e desalocação de memória, pois o garbage collector do Java cuida disso.

Por outro lado, em C++, quando você declara uma variável, você está reservando espaço na memória para armazenar o valor da variável. Em C++, você tem mais controle direto sobre a manipulação de memória, incluindo alocação e desalocação de memória. Isso significa que, em C++, você precisa explicitamente alocar e liberar memória para objetos, utilizando operadores como new e delete.

A diferença fundamental está na gestão de memória: Java utiliza coleta de lixo (garbage collection), enquanto C++ permite uma gestão manual da memória. A abordagem de coleta de lixo em Java ajuda a prevenir vazamentos de memória, mas pode introduzir overhead de desempenho, pois o garbage collector precisa ser executado periodicamente para liberar memória não utilizada.

Em resumo, em Java, quando você declara uma variável, está criando uma referência a um objeto, enquanto em C++, a declaração de variável reserva diretamente espaço na memória para o valor da variável. Essa diferença reflete as estratégias de gerenciamento de memória adotadas por cada linguagem.
