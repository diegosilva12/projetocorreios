<template>
  <div id="home">
    <Menu />
    <v-content>
      <v-container class="fill-height" fluid>
        <v-row align="center" justify="center">
          <v-col class="text-center">
            <h2>Meus Dados</h2>
            <v-form v-model="valid">
              <v-container>
                <v-row>
                  <v-col cols="12" md="12">
                    <v-text-field v-model="firstname" :rules="nameRules" label="Nome" required></v-text-field>
                  </v-col>

                  <v-col cols="12" md="6">
                    <v-text-field
                      v-model="lastname"
                      :rules="nameRules"
                      label="Data de Nascimento"
                      required
                    ></v-text-field>
                  </v-col>

                  <v-col cols="12" md="6">
                    <v-text-field v-model="email" :rules="emailRules" label="CPF" required></v-text-field>
                  </v-col>

                  <v-col cols="12" md="12">
                    <v-text-field v-model="email" :rules="emailRules" label="E-mail" required></v-text-field>
                  </v-col>

                  <v-col cols="12" md="6">
                    <v-text-field
                      v-model="email"
                      :rules="emailRules"
                      label="Alterar senha"
                      required
                    ></v-text-field>
                  </v-col>

                  <v-col cols="12" md="6">
                    <v-text-field
                      v-model="email"
                      :rules="emailRules"
                      label="Confirmar senha"
                      required
                    ></v-text-field>
                  </v-col>
                  <v-col cols="12" md="6">
                    <v-text-field 
                    label="CEP"  id="cep" name="cep" type="text">
                    </v-text-field>
                  </v-col>
                  <v-col cols="12" md="6">
                    <v-text-field 
                    label="Logradouro" id="logradouro" name="logradouro" type="text">
                    </v-text-field>
                  </v-col>
                  <v-col cols="12" md="6">
                    <v-text-field 
                    label="Bairro" id="bairro" name="bairro" type="text">
                    </v-text-field>
                  </v-col>
                  <v-col cols="12" md="6">
                    <v-text-field 
                    label="Cidade" id="cidade" name="cidade" type="text">
                    </v-text-field>
                  </v-col>
                  <v-col cols="12" md="6">
                    <v-text-field 
                    label="Estado" id="estado" name="estado" type="text">
                    </v-text-field>
                  </v-col>
                  <v-col cols="12" md="6">
                    <v-text-field 
                    label="Numero" id="numero" name="numero" type="text">
                    </v-text-field>
                  </v-col>
                  <v-btn
                    :disabled="!valid"
                    color="success"
                    class="mr-4"
                    to="meus-dados"
                  >Atualizar</v-btn>
                </v-row>
              </v-container>
            </v-form>
          </v-col>
        </v-row>
      </v-container>
    </v-content>
  </div>
</template>

<script>
import Menu from "@/components/Menu";

export default {
  name: "Home",
  components: { Menu }
};
</script>
