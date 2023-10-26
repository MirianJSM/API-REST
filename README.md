# API-REST

# DesafioSicred

Automacao dos testes para as API`S de usuario, produto e status da aplicacao que é responsável por gerenciar produtos eletrônicos. 



# Tecnologias utilizadas

Java - https://www.java.com/pt-BR/



Rest-Assured - https://mvnrepository.com/artifact/io.rest-assured/rest-assured



Gson - https://mvnrepository.com/artifact/com.google.code.gson/gson



Lombok -  https://mvnrepository.com/artifact/org.projectlombok/lombok



Junit 5 - https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api


Allure - https://allurereport.org/docs/#_junit_5


IDE Intellig - https://www.jetbrains.com/pt-br/idea/




# Regras de Negócio

Garantir que a aplicação está funcionando corretamente de acordo com a documentação.
#Os campos nao possuem  restriçao te tamanho e obrigatoriedade
#O token é gerado após fazer login com o endpoint /auth/login




#Plano de Testes

- GET /test
  
  Validar a consulta com sucesso

  
- GET /users


  Validar a consulta de usuarios com sucesso

  
- POST /auth/login

  
 Validar o login com sucesso
 
 

 Validar o login com usarnme invalido

 


Validar o login com username vazio




Validar o login com password vazio




 Validar o login com password invalido

 



  
- GET /auth/products
- GET /products
- GET /products/{id}
- POST /products/add

  
  Validar a consulta de todos produtos com sucesso

  
  Validar a consulta de um produto espeficico com sucesso

  
  Validar a consulta de um produto inexistente

  
  Validar a adiçao de um produto com sucesso

  

  #Bug
  CT:  Validar a adiçao de um produto com sucesso

  
  Descriçao: Ao adicionar o produto, o status code esperado é 201 e a API esta retornando 200



  Sugestao de melhoria:

  
  CT: Validar a consulta de um produto enviando um token invalido

  
  Descriçao: Ao enviar um token invalido, a mensagem de erro esta: "Invalid/Expired Token!", quando deveria
  ser "UNAUTHORIZED"

