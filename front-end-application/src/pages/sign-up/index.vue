<template>
  <v-container fluid fill-height> 
    <v-layout align-center justify-center>
      <v-flex xs12 sm8 md4>
          <v-card class="elevation-12">
            <v-toolbar color="primary" dark flat>
              <v-toolbar-title>Cadastro Usuário</v-toolbar-title>
              <v-spacer></v-spacer>
            </v-toolbar>
            <v-card-text>
              <v-form>
                <v-text-field label="Nome*" name="nome" type="text"></v-text-field>
                <v-text-field label="CPF*" name="CPF" type="text"></v-text-field>
                <v-text-field label="Nascimento*" name="data-nascimento" type="numeric"></v-text-field>
                <v-text-field label="E-mail*" name="email" type="text"></v-text-field>
                <v-text-field
                  id="password"
                  label="Senha*"
                  name="password"
                  type="password"
                ></v-text-field>
                <v-text-field label="CEP*" name="cep" type="text"></v-text-field>
                <v-text-field label="Logradouro" name="cep" type="text"></v-text-field>
                <v-text-field label="Bairro" name="cep" type="text"></v-text-field>
                <v-text-field label="Cidade" name="cep" type="text"></v-text-field>
                <v-text-field label="Estado" name="cep" type="text"></v-text-field>
                <v-text-field label="Numero" name="cep" type="text"></v-text-field>
              </v-form>
            </v-card-text>
            <v-card-actions>
              <v-spacer></v-spacer>
              <v-btn color="success">Salvar</v-btn>
            </v-card-actions>
          </v-card>
        </v-flex>
    </v-layout>
  </v-container>
</template>

<script>
export default {
    name: 'SingUp',
  data: () => ({ })
};
</script>
