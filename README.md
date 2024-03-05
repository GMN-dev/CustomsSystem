# Sistema de Alfândega com Conceitos Avançados de Orientação a Objetos

![image](https://github.com/GMN-dev/CustomsSystem/assets/84913052/2db165a0-a314-4c41-b3c2-a1d23cabff74)


Este projeto é um sistema de alfândega desenvolvido em Java, que emprega os princípios da programação orientada a objetos (OOP), incluindo herança, polimorfismo e sobreposição. Ele permite ao usuário cadastrar produtos comuns, produtos usados e produtos importados, fornecendo informações específicas para cada tipo de produto, como taxa de alfândega para produtos importados. O sistema gera etiquetas de preço correspondentes e as exibe ao usuário.
Descrição

O sistema simula um processo de alfândega, onde produtos importados precisam ser registrados com a taxa de alfândega correspondente. Além disso, permite o cadastro de produtos usados, fornecendo a data de fabricação como informação adicional. Essa aplicação prática dos conceitos de OOP inclui:

    Herança: Extensão de classes para criar hierarquias de produtos, como a classe UsedProduct e ImportedProduct que herdam da classe base Product.

    Polimorfismo: Utilização de métodos polimórficos para fornecer comportamentos diferentes para cada tipo de produto, como a sobreposição do método priceTag().

    Sobreposição: Sobrescrita de métodos para adaptar o comportamento de acordo com a classe específica, como a implementação do método priceTag() em cada classe de produto.

## Funcionalidades

    Cadastro de produtos comuns, usados e importados.
    Registro de taxa de alfândega para produtos importados.
    Exibição de etiquetas de preço para cada produto cadastrado, incluindo informações adicionais quando aplicável.

## Detalhes de Implementação

  - Product: Classe abstrata que representa um produto genérico. Possui atributos comuns a todos os produtos, como nome e preço, e métodos para calcular o preço total do produto e gerar a etiqueta de preço.
  - UsedProduct: Classe que representa um produto usado, que herda de Product. Além dos atributos de Product, possui um atributo adicional para a data de fabricação e sobrescreve o método priceTag() para incluir informações sobre a condição do produto.
  - ImportedProduct: Classe que representa um produto importado, que herda de Product. Além dos atributos de Product, possui um atributo adicional para a taxa de alfândega e sobrescreve o método priceTag() para incluir informações sobre a taxa de alfândega.


## Tecnologias Utilizadas

    Linguagem de Programação: Java
    Biblioteca de Data e Hora: java.time.LocalDate
    Formatação de Data: java.time.format.DateTimeFormatter
    Entrada de Dados: java.util.Scanner
    Estrutura de Dados: java.util.ArrayList
    Conceitos de OOP: Herança, Polimorfismo, Sobreposição

## Como Utilizar

    Execute o arquivo Main.java.
    Insira o número de produtos que deseja cadastrar.
    Para cada produto, siga as instruções fornecidas pelo sistema:
        Escolha entre cadastrar um produto comum, usado ou importado.
        Forneça o nome, preço e informações adicionais conforme solicitado.
    Para produtos importados, forneça a taxa de alfândega.
    Após o cadastro de todos os produtos, o sistema exibirá as etiquetas de preço correspondentes.


<br><br><br><br>


# Customs System with Advanced Object-Oriented Concepts

![image](https://github.com/GMN-dev/CustomsSystem/assets/84913052/2db165a0-a314-4c41-b3c2-a1d23cabff74)

This project is a customs system developed in Java, which employs the principles of object-oriented programming (OOP), including inheritance, polymorphism, and overriding. It allows the user to register common products, used products, and imported products, providing specific information for each type of product, such as customs duty for imported products. The system generates corresponding price tags and displays them to the user.

## Description

The system simulates a customs process, where imported products need to be registered with the corresponding customs duty. Additionally, it allows the registration of used products, providing the manufacturing date as additional information. This practical application of OOP concepts includes:

- **Inheritance:** Extending classes to create product hierarchies, such as the `UsedProduct` and `ImportedProduct` classes that inherit from the base `Product` class.

- **Polymorphism:** Utilization of polymorphic methods to provide different behaviors for each type of product, such as overriding the `priceTag()` method.

- **Overriding:** Overriding methods to adapt behavior according to the specific class, such as implementing the `priceTag()` method in each product class.

## Features

- Registering common, used, and imported products.
- Recording customs duty for imported products.
- Displaying price tags for each registered product, including additional information when applicable.

## Implementation Details

- **Product:** Abstract class representing a generic product. It has common attributes such as name and price, and methods to calculate the total price of the product and generate the price tag.

- **UsedProduct:** Class representing a used product, which inherits from `Product`. In addition to the attributes of `Product`, it has an additional attribute for the manufacturing date and overrides the `priceTag()` method to include information about the product's condition.

- **ImportedProduct:** Class representing an imported product, which inherits from `Product`. In addition to the attributes of `Product`, it has an additional attribute for customs duty and overrides the `priceTag()` method to include information about the customs duty.

## Technologies Used

- Programming Language: Java
- Date and Time Library: java.time.LocalDate
- Date Formatting: java.time.format.DateTimeFormatter
- Input Handling: java.util.Scanner
- Data Structure: java.util.ArrayList
- OOP Concepts: Inheritance, Polymorphism, Overriding

## How to Use

1. Run the Main.java file.
2. Enter the number of products you want to register.
3. For each product, follow the instructions provided by the system:
   - Choose to register a common, used, or imported product.
   - Provide the name, price, and additional information as requested.
4. For imported products, provide the customs duty.
5. After registering all products, the system will display the corresponding price tags.
