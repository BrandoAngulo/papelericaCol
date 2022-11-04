<template>
    <div>
        <form @submit.prevent="inicioSession">
            <div class="mb-3">
                <label for="correo" class="form-label">Email address</label>
                <input type="email" class="form-control" id="correo" aria-describedby="emailHelp" v-model.trim="correo">
                <div id="#" class="form-text">We'll never share your email with anyone else.
                </div>
            </div>
            <div class="mb-3">
                <label for="pass" class="form-label">Password</label>
                <input type="password" class="form-control" id="pass" v-model.trim="pass">
            </div>
            <div class="mb-3 form-check">
                <input type="checkbox" class="form-check-input" id="exampleCheck1">
                <label class="form-check-label" for="exampleCheck1">Check me out</label>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</template>

<script>
export default {
    name: "Login-login",
    data: () => {
        return {
            correo: "",
            pass: "",
        }
    },
    methods: {
        async inicioSession() {
            let payload = {
                correo: this.correo,
                pass: this.pass
            };
            console.log(payload);
             /* await this.axios.post('/usuario/listar', payload)
                //respuesta de la promesa
                .then(response => {
                    console.log(response);
                }); 
        */ }
    }
}

</script>

