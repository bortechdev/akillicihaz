--
-- PostgreSQL database dump
--

-- Dumped from database version 14.2
-- Dumped by pg_dump version 14.0

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: Kullanici; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Kullanici" (
    "Id" character varying NOT NULL,
    "Sifre" character varying NOT NULL
);


ALTER TABLE public."Kullanici" OWNER TO postgres;

--
-- Data for Name: Kullanici; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public."Kullanici" VALUES
	('ProfDrCelalCeken', '123456'),
	('YigitCuhadar', 'b211210383'),
	('DogukanGoktas', 'b211210301');


--
-- Name: Kullanici unique_Kullanici_Id; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Kullanici"
    ADD CONSTRAINT "unique_Kullanici_Id" UNIQUE ("Id");


--
-- PostgreSQL database dump complete
--

