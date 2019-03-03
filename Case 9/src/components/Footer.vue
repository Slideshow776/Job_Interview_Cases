<template>
  <div class="component">
    <h3><a href="https://openweathermap.org">Powered by OpenWeatherMap</a></h3>
  </div>
</template>

<script>
export default {}
</script>

<style scoped>
  .component {
    background-color:#caebf2;
    border-radius: .25rem .25rem 0 0;
    
    position: fixed;
    left: 0;
    bottom: 0;
    width: 100%;
    height: 3rem;

    display: flex;
    align-items: center;
    justify-content: center;
  }

  a, a:hover, a:visited {
    text-decoration: none;
    color: inherit;
  }
</style>
