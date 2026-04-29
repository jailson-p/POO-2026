# Comércio

```mermaid
classDiagram
       
    class Cliente {
        -nome: String
        -email: String
        -enderecos: ArrayList~String~
        -pedidos : ArrayList ~Pedido~
    }
    
    class Produto{
        - nome: String
        - descricao: String
        - preco: Double
        - estoque: Double
        +Produtos(nome: String,descricao: String,preco: Double)
        +addEstoque(quantidade: Double)
        
    }
    class Pedido{
        -dataPedido: LocalDate
        -dataEntrega: LocalDate
        -situacaoPagamento: String
        -situacaoEntrega: String
        -produtos: HashMap ~Produto,Double~
        -precoTotal : Double
        +Pedido(dataPedido: LocalDate, situacaoPagamento: String, situacaoEntrega: String, produtos: ArrayList~Produto,Double~)
        +changeSituacaoPag(novaSituacaoPag: String)
        +changeSituacaoEntrega(novaSituacaoEntrega: String)
        +changeDataEntrega(dataEntrega: LocalDate)
    }

Cliente "1" *-- "0..*" Pedido
Pedido "1" o-- "1..*" Produto

```
- Um produto tem uma descrição, um preço e uma quantidade em estoque.
- Um cliente tem um nome, um e-mail e um ou mais endereços de entrega.
- Um cliente pode fazer um ou mais pedidos. 
- Um pedido tem uma data, uma situação (pendente, pago, entregue, cancelado), um ou mais produtos, sendo que cada produto
tem uma quantidade e um preço unitário.


Composição	*--	Diamante preenchido
Agregação	o--	Diamante vazio
Dependência	..>	Linha tracejada com seta