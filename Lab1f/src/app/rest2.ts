import { Table2 } from "./table2";

export interface Rest2 {
    _embedded: {
        table2s: Table2[]
        },
        _links: {
        self: {
        href: string;
        },
        profile: {
        href: string;
        }
        },
        page: {
        size: number,
        totalElements: number,
        totalPages: number,
        number: number
        }
}
