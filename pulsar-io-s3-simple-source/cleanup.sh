kubectl exec -it pulsar-toolset-0 -n pulsar -- bin/pulsar-admin source delete \
    --name s3-file-source