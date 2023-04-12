Feature: Eu como usuário quero acessar o app do Petz para fazer compras para meus pets

  @only
  Scenario Outline: Validar busca por produtos no app
    Given acesso a pagina inicial do app
    When faco uma busca por um produto <produto>
    Then vejo uma lista de produtos correspondentes
    Examples:
      | produto |
      | "Ração" |

  @only
  Scenario Outline: Validar seleção de produtos no app
    Given vejo a lista de produtos
    When  seleciono um produto "Ração Premier Raças Específicas"
    Then  vejo os detalhes do produto como preco <preco>
    Examples:
      | preco    |
      | "222,99" |

  @only
  Scenario: Validar inserção de produtos no carrinho
    Given vejo os detalhes do produto
    When adiciono ao carrinho
    Then vejo o produto no carrinho

  @only
  Scenario: Validar deleção de produtos no carrinho
    Given que exista um produto no carrinho
    When removo o produto carrinho
    Then vejo o produto no carrinho vazio