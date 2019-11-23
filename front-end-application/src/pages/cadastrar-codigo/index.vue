<template>
  <div id="home">
    <Menu />
    <v-content>
      <v-container class="fill-height" fluid>
        <v-row align="center" justify="center">
          <v-col class="text-center">
            <h2 class="center">Cadastrar Produto</h2>
            <v-form v-model="valid">
              <v-container>
                <v-row>
                  <v-col cols="12" md="12">
                    <v-text-field
                      v-model="firstname"
                      :rules="nameRules"
                      label="Nome do produto"
                      required
                    ></v-text-field>
                  </v-col>

                  <v-col cols="12" md="12">
                    <v-text-field
                      v-model="lastname"
                      :rules="nameRules"
                      label="Insira o código de rastreio"
                      required
                    ></v-text-field>
                  </v-col>

                  <v-col cols="12" md="12">
                    <v-text-field
                      v-model="email"
                      :rules="emailRules"
                      label="Data da compra"
                      required
                    ></v-text-field>
                  </v-col>
                  <v-btn
                    :disabled="!valid"
                    color="success"
                    class="mr-4"
                    @click="cadastrar"
                  >Cadastrar Códgio</v-btn>
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
  components: { Menu }
};
</script>
