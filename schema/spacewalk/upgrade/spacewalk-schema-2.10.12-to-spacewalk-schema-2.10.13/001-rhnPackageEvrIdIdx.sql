CREATE INDEX rhn_package_evr_id_idx
    ON rhnPackage(evr_id)
    TABLESPACE [[64k_tbs]]
    NOLOGGING;
