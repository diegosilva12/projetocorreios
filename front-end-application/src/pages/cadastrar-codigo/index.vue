<template>
  <div id="home">
    <Menu />
    <div id="app">
      <div style="margin-top:100px;">
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
                <v-text-field v-model="email" :rules="emailRules" label="Data da compra" required></v-text-field>
              </v-col>
              <v-btn
                :disabled="!valid"
                color="success"
                class="mr-4"
                @click="cadastrar"
              >Cadastrar Código</v-btn>
            </v-row>
          </v-container>
        </v-form>
      </div>
    </div>
  </div>
</template>

<script>
import Menu from "@/components/Menu";
export default {
  name: "Home",
  components: { Menu }
};
</script>
