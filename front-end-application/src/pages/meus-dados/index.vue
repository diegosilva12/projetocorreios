<template>
  <div id="home">
    <Menu />
    <div id="app">
      <div style="margin-top:100px;">
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
                <v-text-field v-model="email" :rules="emailRules" label="Alterar senha" required></v-text-field>
              </v-col>

              <v-col cols="12" md="6">
                <v-text-field v-model="email" :rules="emailRules" label="Confirmar senha" required></v-text-field>
              </v-col>
              <v-btn :disabled="!valid" color="success" class="mr-4" @click="atualizar">Atualizar</v-btn>
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
