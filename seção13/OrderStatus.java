package seção13;

public enum OrderStatus {
    PENDING_PAYMENT,
    PROCESSING,
    SHIPPED,
    DELIVERED;
}
/* As instâncias dos tipos enum são criadas e nomeadas junto com a declaração da classe, sendo fixas e imutáveis (o valor é fixo);
Não é permitido criar novas instâncias com a palavra chave new;
O construtor é declarado private, embora não precise de modificador private explícito;
Seguindo a convenção, por serem objetos constantes e imutáveis (static final), os nomes declarados recebem todas as letras em
MAIÚSCULAS;
As instâncias dos tipos enum devem obrigatoriamente ter apenas um nome;
Opcionalmente, a declaração da classe pode incluir variáveis de instância, construtor, métodos de instância, de classe, etc.*/