<template>
  <div id="app">
    <header>
      <Banner />
    </header>
    <main>
      <Current />
      <Cases />
    </main>
    <footer>
      <Links />
    </footer>
  </div>
</template>

<script>
import Banner from "./components/Banner.vue";
import Current from "./components/Current.vue";
import Cases from "./components/Cases.vue";
import Links from "./components/Links.vue";

export default {
  name: "App",
  components: {
    Banner,
    Current,
    Cases,
    Links,
  },
};
</script>

<style>
body {
  margin: 0;
  padding: 0;
}
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  text-align: center;
  text-align: left;
}

/* unvisited link */
a:link {
  color: rgb(63, 168, 168);
}

/* visited link */
a:visited {
  color: rgb(40, 112, 112);
}

/* mouse over link */
a:hover {
  color: black;
}
</style>
