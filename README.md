# 🚀 Sistema de Seleção Interestelar

Este projeto é uma aplicação simples em Java que simula a coleta e análise de dados de candidatos para uma missão espacial. O programa interage com o usuário via terminal, solicitando informações básicas e avaliando critérios para participação nos testes físicos.

---

## 🧠 Funcionalidades

* Coleta de dados do candidato:

  * Nome completo
  * Idade terrestre
  * Altura
  * Experiência com pilotagem de drones
* Exibição formatada das informações inseridas
* Avaliação automática de qualificação:

  * Verifica experiência em pilotagem
  * Determina aptidão com base na idade (entre 18 e 45 anos)

---

## 🛠️ Tecnologias Utilizadas

* **Java**
* Classe `Scanner` para entrada de dados via terminal

---

## ▶️ Como Executar

1. Certifique-se de ter o Java instalado na sua máquina.
2. Compile o arquivo:

```bash
javac ColetaDados.java
```

3. Execute o programa:

```bash
java ColetaDados
```

---

## 💡 Exemplo de Uso

```text
--- SISTEMA DE SELECAO INTERESTELAR ---
Por favor, insira os dados do candidato.
Nome completo do aspirante: Ana Silva
Idade terrestre: 29
Altura (em metros): 1.70
Possui experiencia com pilotagem de drones? (true/false): true

--- PROCESSANDO DADOS DA FICHA ---
Candidato: Ana Silva
Idade: 29 anos | Altura: 1.70 m
Qualificado para pilotagem? Sim
Status: Apto para os testes fisicos.
--------------------------------------
```

---

## 📋 Regras de Avaliação

* ✔️ **Idade permitida:** entre 18 e 45 anos
* ✔️ **Experiência com drones:** exibida como critério informativo

---

## 📌 Possíveis Melhorias

* Validação de entrada de dados (evitar erros de digitação)
* Interface gráfica (GUI)
* Persistência de dados em banco de dados
* Suporte a múltiplos candidatos
* Internacionalização (multi-idioma)

---

## 🧑‍🚀 Contexto

Inspirado em um cenário futurista, o sistema representa uma triagem inicial para candidatos interessados em participar de missões espaciais, tornando o aprendizado de Java mais envolvente e prático.

---

## 📄 Licença

Este projeto é livre para uso educacional e pode ser modificado conforme necessário.

---
