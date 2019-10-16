<template>
  <v-app id="inspire">
    <v-navigation-drawer v-model="drawer" :clipped="$vuetify.breakpoint.lgAndUp" app>
      <v-list dense>
        <template v-for="item in items">
          <v-row v-if="item.heading" :key="item.heading" align="center">
            <v-col cols="6">
              <v-subheader v-if="item.heading">{{ item.heading }}</v-subheader>
            </v-col>
            <v-col cols="6" class="text-center">
              <a href="#!" class="body-2 black--text">EDIT</a>
            </v-col>
          </v-row>
          <v-list-group
            v-else-if="item.children"
            :key="item.text"
            v-model="item.model"
            :prepend-icon="item.model ? item.icon : item['icon-alt']"
            append-icon
          >
            <template v-slot:activator>
              <v-list-item>
                <v-list-item-content>
                  <v-list-item-title>{{ item.text }}</v-list-item-title>
                </v-list-item-content>
              </v-list-item>
            </template>
            <v-list-item v-for="(child, i) in item.children" :key="i">
              <v-list-item-action v-if="child.icon">
                <v-icon>{{ child.icon }}</v-icon>
              </v-list-item-action>
              <v-list-item-content>
                <v-list-item-title>{{ child.text }}</v-list-item-title>
              </v-list-item-content>
            </v-list-item>
          </v-list-group>
          <v-list-item v-else :key="item.text" :to="item.page">
            <v-list-item-action>
              <v-icon>{{ item.icon }}</v-icon>
            </v-list-item-action>
            <v-list-item-content>
              <v-list-item-title>{{ item.text }}</v-list-item-title>
            </v-list-item-content>
          </v-list-item>
        </template>
      </v-list>
    </v-navigation-drawer>

    <v-app-bar :clipped-left="$vuetify.breakpoint.lgAndUp" app color="blue darken-3" dark>
      <v-toolbar-title style="width: 300px" class="ml-0 pl-4">
        <v-app-bar-nav-icon @click.stop="drawer = !drawer"></v-app-bar-nav-icon>
        <span class="hidden-sm-and-down">Sistema de Rastreio</span>
      </v-toolbar-title>
      <v-text-field flat solo-inverted hide-details label="Pesquisa" class="hidden-sm-and-down"></v-text-field>
      <div class="flex-grow-1"></div>
      <v-btn icon></v-btn>
      <v-btn icon>
        <v-icon>mdi-bell</v-icon>
      </v-btn>
      <v-btn icon large>
        <v-avatar size="32px" item>
          <v-img src="https://cdn.vuetifyjs.com/images/logos/logo.svg" alt="Vuetify"></v-img>
        </v-avatar>
      </v-btn>
    </v-app-bar>
    <v-content>
      <v-container class="fill-height" fluid>
          <div class="col-md-12 v-data-table theme--light">
            <div class="v-data-table__wrapper">
              <table>
                <colgroup>
                  <col class />
                  <col class />
                  <col class />
                  <col class />
                </colgroup>
                <thead class="v-data-table-header">
                  <tr>
                    <th
                      role="columnheader"
                      scope="col"
                      aria-label="ID"
                      aria-sort="none"
                      class="text-left"
                    >
                      <span>ID</span>
                    </th>
                    <th
                      role="columnheader"
                      scope="col"
                      aria-label="Produto: Not sorted. Activate to sort ascending."
                      aria-sort="none"
                      class="text-start sortable"
                    >
                      <span>Produto</span>
                      <i
                        aria-hidden="true"
                        class="v-icon notranslate v-data-table-header__icon mdi mdi-arrow-up theme--light"
                        style="font-size: 18px;"
                      ></i>
                    </th>
                    <th
                      role="columnheader"
                      scope="col"
                      aria-label="Data da compra"
                      aria-sort="none"
                      class="text-start sortable"
                    >
                      <span>Data da compra</span>
                      <i
                        aria-hidden="true"
                        class="v-icon notranslate v-data-table-header__icon mdi mdi-arrow-up theme--light"
                        style="font-size: 18px;"
                      ></i>
                    </th>
                    <th
                      role="columnheader"
                      scope="col"
                      aria-label="Código de Rastreio"
                      aria-sort="none"
                      class="text-start sortable"
                    >
                      <span>Código de Rastreio</span>
                      <i
                        aria-hidden="true"
                        class="v-icon notranslate v-data-table-header__icon mdi mdi-arrow-up theme--light"
                        style="font-size: 18px;"
                      ></i>
                    </th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td class="text-left">01</td>
                    <td class="text-start">Celular</td>
                    <td class="text-start">10/08/2019</td>
                    <td class="text-start">1231DFSA12</td>
                  </tr>
                  <tr>
                    <td class="text-left">02</td>
                    <td class="text-start">Bateria</td>
                    <td class="text-start">27/07/2019</td>
                    <td class="text-start">54fdas54fa</td>
                  </tr>
                  <tr>
                    <td class="text-left">03</td>
                    <td class="text-start">Memória</td>
                    <td class="text-start">28/02/2019</td>
                    <td class="text-start">FDKSJGF5454</td>
                  </tr>
                </tbody>
              </table>
            </div>
          </div>
      </v-container>
    </v-content>
    <v-btn bottom color="info" dark fab fixed right @click="dialog = !dialog">
      <v-icon>mdi-plus</v-icon>
    </v-btn>
    <v-dialog v-model="dialog" width="800px">
      <v-card>
        <v-card-title class="grey">Adicionar código de rastreio</v-card-title>
        <v-container>
          <v-row>
            <v-col class="align-center justify-space-between" cols="12">
              <v-row align="center">
                <v-col cols="12">
                  <v-text-field label="Nome do produto" placeholder="Insira o nome do produto"></v-text-field>
                </v-col>
              </v-row>
            </v-col>
            <v-col cols="12">
              <v-text-field
                label="Insira o código de rastreio"
                placeholder="Insira o  código dde rastreio"
              ></v-text-field>
            </v-col>
            <v-col cols="12">
              <v-text-field label="Data da compra" placeholder="Data da compra"></v-text-field>
            </v-col>
          </v-row>
        </v-container>
        <v-card-actions>
          <div class="flex-grow-1"></div>
          <v-btn color="success" text @click="dialog = false">Salvar</v-btn>
        </v-card-actions>
      </v-card>
    </v-dialog>
  </v-app>
</template>

<script>
export default {
  name: "Home",
  data: () => ({
    dialog: false,
    drawer: null,
    items: [
      { text: "Home" },
      { text: "Cadastrar código", page: 'cadastrar-codigo' },
      { text: "Meus Dados", page: 'meus-dados' },
      { text: "Sair do Sistema" }
    ]
  })
};
</script>
