# Docker

```bash
git clone git@github.com:paw-jan/pjdockers.git
```

# In docker

## Manifest  

```bash
repo init -u https://github.com/paw-jan/pjrxrepomanifests.git -m rpi5-manifest/kirkstone.xml
repo sync
```

## Build

```bash
source  meta-pjrxrpi5/setup_build_env

bitbake pjrxrpi5-core-image-full-cmdline
```

