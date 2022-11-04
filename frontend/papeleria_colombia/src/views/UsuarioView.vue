<template>
    <div>
        <ListarUser  :usuarios="usuarios"/>
        <CreateUser  @refresh="refresh" />
    </div>
</template>

<script>
import ListarUser from "@/components/usuario/ListarUser.vue";
import CreateUser from "@/components/usuario/CreateUser.vue";
import axios from "axios";

export default {
    name: "UsuarioView",
    components: {
        ListarUser, CreateUser,
    },
    data: () => ({
        usuarios: [],
    }),
    mounted() {
        this.getUsuarios();
    },
    methods: {
         refresh() {
            this.getUsuarios();
        }, 
         getUsuarios() {
           axios
                .get('http://localhost:3000/api/usuario/listar')
                .then((res) => {
                    this.usuarios = res.data;
                    console.log(this.usuarios);
                }); 
        }

    },
}
</script>