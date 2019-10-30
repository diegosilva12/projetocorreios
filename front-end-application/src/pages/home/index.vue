<template>
  <div id="home">
    <Menu />
    <v-container class="col-md-12">
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
  </div>
</template>
  


<script>
import Menu from "@/components/Menu";

export default {
  name: "Home",
  components: { Menu }
}
</script>
