<template>
  <q-layout view="lHh Lpr lFf">
    <q-page-container>
      <router-view />
    </q-page-container>
  </q-layout>
</template>

<script>
import { openURL } from 'quasar'

export default {
  name: 'MyLayout',
  data () {},
  methods: {
    apriUrl (url) {
      openURL(url)
    }
  }
}
</script>

<style>
</style>
