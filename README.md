# build-signed-apk
Build a signed APK of your Android application

## Inputs

The following inputs are all required

- `keystore`: the keystore file (.jks) as base64. I highly recommand you to generate this with the linux `base64` command, it did not work for me using websites to convert it
- `keystore_password`: the password of the file
- `key_alias`: the alias of the key
- `key_password`: the password of the key

## Example

```yaml
- name: Build Signed APK
  uses: Victor-Bo/build-signed-apk@v7
  with:
    keystore: ${{ secrets.keystore }}
    keystore_password: ${{ secrets.keystore_password }}
    key_alias: ${{ secrets.key_alias }}
    key_password: ${{ secrets.key_password }}
```

## Get your APK

The APK is built at the default location, which is: `/app/build/outputs/apk/release/app-release.apk`. Feel free to do whatever you want with this apk now, like creating a release with it or putting it as an artifact of the release
