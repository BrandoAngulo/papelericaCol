<template>
    <div>
        <ListarVentas  :ventas="ventas"/>
        <CreateVentas  @refresh="refresh" />
    </div>
</template>

<script>
import ListarVentas from "@/components/ventas/ListarVentas.vue";
import CreateVentas from "@/components/ventas/CreateVentas.vue";
import axios from "axios";

export default {
    name: "ventasView",
    components: {
        ListarVentas,
        CreateVentas, 
    },
    data: () => ({
        ventas: [],
    }),
    mounted() {
        this.getVentas();
    },
    methods: {
         refresh() {
            this.getVentas();
        }, 
         getVentas() {
           axios
                .get('http://localhost:3000/api/ventas/listar')
                .then((res) => {
                    this.ventas = res.data;
                    console.log(this.ventas);
                }); 
        }

    },
}
</script>