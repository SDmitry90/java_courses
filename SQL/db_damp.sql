--
-- PostgreSQL database dump
--

-- Dumped from database version 10.3
-- Dumped by pg_dump version 10.4

-- Started on 2019-04-30 18:54:18

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

SET default_with_oids = false;

--
-- TOC entry 197 (class 1259 OID 16396)
-- Name: brand; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.brand (
    id integer NOT NULL,
    name character varying(50) NOT NULL,
    created timestamp with time zone DEFAULT now() NOT NULL,
    updated timestamp with time zone DEFAULT now() NOT NULL
);


--
-- TOC entry 196 (class 1259 OID 16394)
-- Name: brand_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE public.brand_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 2841 (class 0 OID 0)
-- Dependencies: 196
-- Name: brand_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE public.brand_id_seq OWNED BY public.brand.id;


--
-- TOC entry 201 (class 1259 OID 16437)
-- Name: car; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.car (
    id integer NOT NULL,
    vin character varying(50) NOT NULL,
    updated timestamp with time zone DEFAULT now() NOT NULL,
    created timestamp with time zone DEFAULT now() NOT NULL,
    model_id integer NOT NULL
);


--
-- TOC entry 200 (class 1259 OID 16435)
-- Name: car_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE public.car_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 2842 (class 0 OID 0)
-- Dependencies: 200
-- Name: car_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE public.car_id_seq OWNED BY public.car.id;


--
-- TOC entry 199 (class 1259 OID 16414)
-- Name: model; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.model (
    id integer NOT NULL,
    name character varying NOT NULL,
    created timestamp with time zone DEFAULT now() NOT NULL,
    updated timestamp with time zone DEFAULT now() NOT NULL,
    brand_id integer NOT NULL
);


--
-- TOC entry 198 (class 1259 OID 16412)
-- Name: model_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE public.model_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 2843 (class 0 OID 0)
-- Dependencies: 198
-- Name: model_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE public.model_id_seq OWNED BY public.model.id;


--
-- TOC entry 2683 (class 2604 OID 16399)
-- Name: brand id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.brand ALTER COLUMN id SET DEFAULT nextval('public.brand_id_seq'::regclass);


--
-- TOC entry 2689 (class 2604 OID 16440)
-- Name: car id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.car ALTER COLUMN id SET DEFAULT nextval('public.car_id_seq'::regclass);


--
-- TOC entry 2686 (class 2604 OID 16417)
-- Name: model id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.model ALTER COLUMN id SET DEFAULT nextval('public.model_id_seq'::regclass);


--
-- TOC entry 2830 (class 0 OID 16396)
-- Dependencies: 197
-- Data for Name: brand; Type: TABLE DATA; Schema: public; Owner: -
--

INSERT INTO public.brand (id, name, created, updated) VALUES (1, 'VW', '2019-04-24 20:22:38.417448+03', '2019-04-24 20:22:38.417448+03');
INSERT INTO public.brand (id, name, created, updated) VALUES (2, 'Geely', '2019-04-24 20:22:54.031555+03', '2019-04-24 20:22:54.031555+03');
INSERT INTO public.brand (id, name, created, updated) VALUES (3, 'Audi', '2019-04-24 20:23:17.824221+03', '2019-04-24 20:23:17.824221+03');
INSERT INTO public.brand (id, name, created, updated) VALUES (4, 'opel', '2019-04-26 18:46:32.090319+03', '2019-04-26 18:46:32.090319+03');


--
-- TOC entry 2834 (class 0 OID 16437)
-- Dependencies: 201
-- Data for Name: car; Type: TABLE DATA; Schema: public; Owner: -
--

INSERT INTO public.car (id, vin, updated, created, model_id) VALUES (6, 'atlas_vw_002', '2019-04-24 20:43:14.302735+03', '2019-04-24 20:43:14.302735+03', 4);
INSERT INTO public.car (id, vin, updated, created, model_id) VALUES (2, 'jetta001', '2019-04-24 20:43:14.302735+03', '2019-04-24 20:43:14.302735+03', 5);
INSERT INTO public.car (id, vin, updated, created, model_id) VALUES (3, 'jetta002', '2019-04-24 20:43:14.302735+03', '2019-04-24 20:43:14.302735+03', 5);
INSERT INTO public.car (id, vin, updated, created, model_id) VALUES (5, 'atlas_vw_001', '2019-04-24 20:43:14.302735+03', '2019-04-24 20:43:14.302735+03', 6);
INSERT INTO public.car (id, vin, updated, created, model_id) VALUES (4, 'astra001', '2019-04-24 20:43:14.302735+03', '2019-04-24 20:43:14.302735+03', 5);


--
-- TOC entry 2832 (class 0 OID 16414)
-- Dependencies: 199
-- Data for Name: model; Type: TABLE DATA; Schema: public; Owner: -
--

INSERT INTO public.model (id, name, created, updated, brand_id) VALUES (4, 'Polo', '2019-04-24 20:25:17.566996+03', '2019-04-24 20:25:17.566996+03', 1);
INSERT INTO public.model (id, name, created, updated, brand_id) VALUES (5, 'Jetta', '2019-04-24 20:25:17.566996+03', '2019-04-24 20:25:17.566996+03', 1);
INSERT INTO public.model (id, name, created, updated, brand_id) VALUES (6, 'Atlas', '2019-04-24 20:26:18.943388+03', '2019-04-24 20:26:18.943388+03', 1);
INSERT INTO public.model (id, name, created, updated, brand_id) VALUES (7, 'Atlas', '2019-04-24 20:26:18.943388+03', '2019-04-24 20:26:18.943388+03', 2);
INSERT INTO public.model (id, name, created, updated, brand_id) VALUES (8, 'Sc7', '2019-04-24 20:26:18.943388+03', '2019-04-24 20:26:18.943388+03', 2);
INSERT INTO public.model (id, name, created, updated, brand_id) VALUES (12, 'Astra', '2019-04-26 18:50:04.901924+03', '2019-04-26 18:50:04.901924+03', 4);


--
-- TOC entry 2844 (class 0 OID 0)
-- Dependencies: 196
-- Name: brand_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('public.brand_id_seq', 4, true);


--
-- TOC entry 2845 (class 0 OID 0)
-- Dependencies: 200
-- Name: car_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('public.car_id_seq', 6, true);


--
-- TOC entry 2846 (class 0 OID 0)
-- Dependencies: 198
-- Name: model_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('public.model_id_seq', 12, true);


--
-- TOC entry 2693 (class 2606 OID 16426)
-- Name: brand brand_name_key; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.brand
    ADD CONSTRAINT brand_name_key UNIQUE (name);


--
-- TOC entry 2695 (class 2606 OID 16401)
-- Name: brand brand_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.brand
    ADD CONSTRAINT brand_pkey PRIMARY KEY (id);


--
-- TOC entry 2702 (class 2606 OID 16442)
-- Name: car car_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.car
    ADD CONSTRAINT car_pkey PRIMARY KEY (id);


--
-- TOC entry 2704 (class 2606 OID 16446)
-- Name: car car_vin_key; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.car
    ADD CONSTRAINT car_vin_key UNIQUE (vin);


--
-- TOC entry 2698 (class 2606 OID 16434)
-- Name: model model_name_brand_id_key; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.model
    ADD CONSTRAINT model_name_brand_id_key UNIQUE (name, brand_id);


--
-- TOC entry 2700 (class 2606 OID 16422)
-- Name: model model_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.model
    ADD CONSTRAINT model_pkey PRIMARY KEY (id);


--
-- TOC entry 2705 (class 1259 OID 16457)
-- Name: fki_d; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX fki_d ON public.car USING btree (model_id);


--
-- TOC entry 2696 (class 1259 OID 16432)
-- Name: fki_fki; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX fki_fki ON public.model USING btree (brand_id);


--
-- TOC entry 2707 (class 2606 OID 16452)
-- Name: car car_model_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.car
    ADD CONSTRAINT car_model_id_fkey FOREIGN KEY (model_id) REFERENCES public.model(id);


--
-- TOC entry 2706 (class 2606 OID 16427)
-- Name: model fki; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.model
    ADD CONSTRAINT fki FOREIGN KEY (brand_id) REFERENCES public.brand(id);


-- Completed on 2019-04-30 18:54:19

--
-- PostgreSQL database dump complete
--

