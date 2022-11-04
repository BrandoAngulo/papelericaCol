<template>
    <div>
        <ListarProveedor :proveedores="proveedores" />
        <CreateProveedor @refresh="refresh" />
    </div>
</template>

<script>
import CreateProveedor from '@/components/proveedor/CreateProveedor.vue';
import ListarProveedor from '@/components/proveedor/ListarProveedor.vue';
import axios from 'axios';

export default {
    name: "ProveedorView",
    components: { ListarProveedor, CreateProveedor },

    data: () => ({
        proveedores: []
    }),

    mounted() {
        this.getProveedores();
    },
    methods: {
        refresh() {
            this.getProveedores();
        }, 
        getProveedores(){
            axios
                .get('http://localhost:3000/api/proveedor/listar')
                .then((res)=> {
                this.proveedores = res.data
                console.log(this.proveedores);
            })
        }
    },

}

</script>