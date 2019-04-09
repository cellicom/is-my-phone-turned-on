<template>
  <q-page class="flex flex-center window-height">
      <template v-if="!ready">
      <q-spinner
        size="5em"
      />
      </template>
      <template v-if="ready">
        <div class="text-h1 text-uppercase text-bold">{{ $t('yes') }}</div>
      </template>
      <div class="fixed-bottom full-width text-right hidden">
        <span class="text-caption text-bold">Is my phone turned on? v.1.0.0 - created by cellicom</span>
      </div>
  </q-page>
</template>

<style>
</style>

<script>
export default {
  name: 'PageIndex',
  data () {
    return {
      ready: false
    }
  },
  mounted () {
    let me = this
    setTimeout(function () {
      me.ready = true
    }, 3000)
  }
}
</script>
