<template>
  <div class="home">
    <h3>Velkommen til Vaskeriet sin hjemmeside!</h3>
    <p>Her kan du reservere vask, avlyse reservasjoner og sette deg på venteliste.</p>
    <img src="https://www.comunicatostampa.org/wp-content/uploads/2017/02/lavanderia-automatica.jpg" alt="vaskemaskiner">
  </div>
</template>

<script>
export default {
  name: 'Home',
  data () {
    return {
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

.home {
  /* margin-top: -2rem;
  margin-right: -1rem;
  margin-left: -1rem; */
  padding-top: 2rem;
}

img {
  height: 100%;
  border: 1px solid #ddd;
  border-radius: 4px;
}

/* .routes {
  display: flex;
  flex-direction: column;
}

h1, h2 {
  font-weight: normal;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #42b983;
} */

</style>
