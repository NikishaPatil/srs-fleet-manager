http http://$(oc get route tenant-manager --template='{{ .spec.host }}')/api/v1/tenants