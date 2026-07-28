public class ContaBancaria {

        // Atributos privados (protegidos contra acessos indesejados)
        private String titular;
        private double saldo;

        public ContaBancaria(String titular) {
            this.titular = titular;
            this.saldo = 0.0;
        }

        public void mostrarSaldo() {
            System.out.println("Nome: " + titular);
            System.out.println("Saldo: R$ " + saldo);
        }

        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito realizado com sucesso!");
            } else {
                System.out.println("Valor de depósito inválido! Tente novamente.");
            }
        }

    public void sacar(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
            }
            else if (valor <= 0) {
                System.out.println("Valor de saque inválido! Tente novamente.");
            }
            else { System.out.println("Saldo insuficiente! Tente novamente.");

            }
        }
    }

