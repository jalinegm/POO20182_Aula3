from time import sleep
print('\033[1;36m-=-\033[m' * 20)
print('\033[1;36m           *-*-*-*-* CLASSE CACHORRO! *-*-*-*-*\033[m')
print('\033[1;36m-=-\033[m' * 20)
sleep(2)

class Cachorro:
    def __init__(self, nome, raca, idade, peso):
        self.nome = nome
        self.raca = raca
        self.idade = idade
        self.peso = peso

    def adora_comer(self):
        self.peso = self.peso + 0.5


c1 = Cachorro(nome = 'Charlotte', raca = 'S.R.D', idade = 7, peso = 9.7)
print('Oi, esta é {}, um cão da raça: {}. \nSua idade é {} anos e de tanto comer pesa {}kg! '.format(c1.nome, c1.raca, c1.idade, c1.peso))
sleep(5)
print('\n{} adora comer.... Quer ver??'.format(c1.nome))
sleep(3)
print('EI!!  Psiu! Vem!!')
sleep(2)
print('{}!!!'.format(c1.nome))
sleep(3)
print('MmMmM... {} está comendo...'.format(c1.nome))
sleep(5)
c1.adora_comer()
print('Uau!!! Agora {} está pesando {}kg!'.format(c1.nome, c1.peso))