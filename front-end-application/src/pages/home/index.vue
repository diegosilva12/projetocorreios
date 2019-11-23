<template>
  <div id="home">
    <Menu />
    <v-content>
      <v-container class="fill-height" fluid>
        <v-row align="center" justify="center">
          <v-col class="text-center">
            <div class="fill-height" fluid>
              <table>
                <thead class="v-data-table-header">
                  <tr>
                    <th
                      role="columnheader"
                      scope="col"
                      aria-label="ID"
                      aria-sort="none"
                      class="text-center"
                    >
                      <span>ID</span>
                    </th>
                    <th
                      role="columnheader"
                      scope="col"
                      aria-label="Produto: Not sorted. Activate to sort ascending."
                      aria-sort="none"
                      class="text-center"
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
                      class="text-center"
                    >
                      <span>Data da compra</span>
                      <i
                        aria-hidden="true"
                        class="text-center"
                        style="font-size: 18px;"
                      ></i>
                    </th>
                    <th
                      role="columnheader"
                      scope="col"
                      aria-label="Código de Rastreio"
                      aria-sort="none"
                      class="text-center"
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
                    <td class="text-center">01</td>
                    <td class="text-center">Celular</td>
                    <td class="text-center">10/08/2019</td>
                    <td class="text-center">1231DFSA12</td>
                  </tr>
                  <tr>
                    <td class="text-center">02</td>
                    <td class="text-center">Bateria</td>
                    <td class="text-center">27/07/2019</td>
                    <td class="text-center">54fdas54fa</td>
                  </tr>
                  <tr>
                    <td class="text-center">03</td>
                    <td class="text-center">Memória</td>
                    <td class="text-center">28/02/2019</td>
                    <td class="text-center">FDKSJGF5454</td>
                  </tr>
                </tbody>
              </table>
            </div>
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

<style scoped>
table {
  border: 2px;
  border-radius: 3px;
  background-color: #000000;
  width: 100%;
}
th {
  background-color: #515453;
  cursor: pointer;
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
}

td {
  background-color: #f9f9f9;
}
</style>
