<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/logo.png">
    <p>hello~~~</p>
    <p>{{val1}}</p>
    <b-form-input v-model="val1" placeholder="test"></b-form-input>
    <b-button @click="test">function</b-button>
  </div>
</template>

<script>
// @ is an alias to /src
export default {
  name: 'Home',
  data(){
    return{
      val1 : 3
    }
  },
  watch:{    
  },
  methods:{
    test(){
      alert("hello! "+ this.val1)
      this.val1 = 5
    }
  }
}
</script>
