  
<template>
  <div>
    <v-navigation-drawer v-model="drawer" app>
      <v-list dense>
        <v-list-item link>
          <v-list-item-action>
            <v-icon>mdi-home</v-icon>
          </v-list-item-action>
          <v-list-item-content>
            <v-list-item-title>Home</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
        <v-list-item link>
          <v-list-item-action>
            <v-icon>mdi-plus-circle</v-icon>
          </v-list-item-action>
          <v-list-item-content>
            <v-list-item-title>Cadastrar Código</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
        <v-list-item link>
          <v-list-item-action>
            <v-icon>mdi-edit</v-icon>
          </v-list-item-action>
          <v-list-item-content>
            <v-list-item-title>Meus Dados</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
        <v-list-item link>
          <v-list-item-action>
            <v-icon>mdi-power</v-icon>
          </v-list-item-action>
          <v-list-item-content>
            <v-list-item-title>Sair do Sistema</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </v-list>
    </v-navigation-drawer>

    <v-btn bottom color="info" dark fab fixed right @click="dialog = !dialog">
      <v-icon>mdi-plus</v-icon>
    </v-btn>
    <v-dialog v-model="dialog" width="800px">
      <v-card>
        <v-card-title class="blue darken-4" >Cadastrar código de rastreio</v-card-title>
        <v-container grid-list-sm>
          <v-layout row wrap>
            <v-flex xs12 align-center justify-space-between>
              <v-layout align-center>
                <v-text-field label="Nome do Produto" placeholder="Nome do Produto"></v-text-field>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-text-field label="Código de rastreio" placeholder="Código de rastreio"></v-text-field>
            </v-flex>
            <v-flex xs12>
              <v-text-field label="Data da compra" placeholder="Data da compra"></v-text-field>
            </v-flex>
          </v-layout>
        </v-container>
        <v-card-actions>
          <v-spacer></v-spacer>
          <v-btn text @click="dialog = false">Salvar</v-btn>
        </v-card-actions>
      </v-card>
    </v-dialog>

    <v-app-bar app color="#0d47a1" dark>
      <v-app-bar-nav-icon @click.stop="drawer = !drawer" />
      <v-toolbar-title>Sistemas Correios</v-toolbar-title>
    </v-app-bar>
    <v-footer color="#0d47a1" app>
      <span class="white--text center">&copy; 2019 Desenvolvido por Diego Silva</span>
    </v-footer>
  </div>
</template>

<script>
export default {
  props: {
    source: String
  },
  data: () => ({
    dialog: false,
    drawer: null,
    items: [
      { text: "Home", page: "home" },
      { text: "Cadastrar código", page: "cadastrar-codigo" },
      { text: "Meus Dados", page: "meus-dados" },
      { text: "Sair do Sistema", page: "login" }
    ]
  })
};
</script>